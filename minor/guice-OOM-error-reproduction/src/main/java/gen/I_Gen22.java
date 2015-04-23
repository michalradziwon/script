
  package gen;
  public class I_Gen22 {
  		@com.google.inject.Inject
  		public I_Gen22(I_Gen23 i_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class I_Gen175 {
  		@com.google.inject.Inject
  		public I_Gen175(I_Gen176 i_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
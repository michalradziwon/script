
  package gen;
  public class I_Gen30 {
  		@com.google.inject.Inject
  		public I_Gen30(I_Gen31 i_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
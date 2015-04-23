
  package gen;
  public class I_Gen91 {
  		@com.google.inject.Inject
  		public I_Gen91(I_Gen92 i_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
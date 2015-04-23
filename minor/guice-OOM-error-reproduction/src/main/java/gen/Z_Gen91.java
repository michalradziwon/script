
  package gen;
  public class Z_Gen91 {
  		@com.google.inject.Inject
  		public Z_Gen91(Z_Gen92 z_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
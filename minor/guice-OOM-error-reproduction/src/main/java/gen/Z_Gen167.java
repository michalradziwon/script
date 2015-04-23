
  package gen;
  public class Z_Gen167 {
  		@com.google.inject.Inject
  		public Z_Gen167(Z_Gen168 z_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
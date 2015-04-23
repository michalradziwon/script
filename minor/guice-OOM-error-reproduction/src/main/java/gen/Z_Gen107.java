
  package gen;
  public class Z_Gen107 {
  		@com.google.inject.Inject
  		public Z_Gen107(Z_Gen108 z_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
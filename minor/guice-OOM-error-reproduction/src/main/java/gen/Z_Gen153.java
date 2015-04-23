
  package gen;
  public class Z_Gen153 {
  		@com.google.inject.Inject
  		public Z_Gen153(Z_Gen154 z_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
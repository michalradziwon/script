
  package gen;
  public class R_Gen52 {
  		@com.google.inject.Inject
  		public R_Gen52(R_Gen53 r_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
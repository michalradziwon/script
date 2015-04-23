
  package gen;
  public class R_Gen113 {
  		@com.google.inject.Inject
  		public R_Gen113(R_Gen114 r_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
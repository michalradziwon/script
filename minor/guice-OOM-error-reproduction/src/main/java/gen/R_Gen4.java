
  package gen;
  public class R_Gen4 {
  		@com.google.inject.Inject
  		public R_Gen4(R_Gen5 r_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class R_Gen5 {
  		@com.google.inject.Inject
  		public R_Gen5(R_Gen6 r_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
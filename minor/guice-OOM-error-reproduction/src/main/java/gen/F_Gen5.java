
  package gen;
  public class F_Gen5 {
  		@com.google.inject.Inject
  		public F_Gen5(F_Gen6 f_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
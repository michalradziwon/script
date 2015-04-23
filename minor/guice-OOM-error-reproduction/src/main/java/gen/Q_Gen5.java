
  package gen;
  public class Q_Gen5 {
  		@com.google.inject.Inject
  		public Q_Gen5(Q_Gen6 q_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
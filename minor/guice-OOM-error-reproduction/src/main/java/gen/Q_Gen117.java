
  package gen;
  public class Q_Gen117 {
  		@com.google.inject.Inject
  		public Q_Gen117(Q_Gen118 q_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
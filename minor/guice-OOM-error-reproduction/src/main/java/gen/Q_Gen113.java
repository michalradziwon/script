
  package gen;
  public class Q_Gen113 {
  		@com.google.inject.Inject
  		public Q_Gen113(Q_Gen114 q_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
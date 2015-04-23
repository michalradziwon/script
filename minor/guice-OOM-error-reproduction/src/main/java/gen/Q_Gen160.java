
  package gen;
  public class Q_Gen160 {
  		@com.google.inject.Inject
  		public Q_Gen160(Q_Gen161 q_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
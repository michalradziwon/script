
  package gen;
  public class Q_Gen89 {
  		@com.google.inject.Inject
  		public Q_Gen89(Q_Gen90 q_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
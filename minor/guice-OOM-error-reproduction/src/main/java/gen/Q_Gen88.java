
  package gen;
  public class Q_Gen88 {
  		@com.google.inject.Inject
  		public Q_Gen88(Q_Gen89 q_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
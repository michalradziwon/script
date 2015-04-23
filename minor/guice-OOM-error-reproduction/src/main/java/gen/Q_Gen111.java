
  package gen;
  public class Q_Gen111 {
  		@com.google.inject.Inject
  		public Q_Gen111(Q_Gen112 q_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
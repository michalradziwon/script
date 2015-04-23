
  package gen;
  public class Q_Gen148 {
  		@com.google.inject.Inject
  		public Q_Gen148(Q_Gen149 q_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
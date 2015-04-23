
  package gen;
  public class Q_Gen139 {
  		@com.google.inject.Inject
  		public Q_Gen139(Q_Gen140 q_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class Q_Gen140 {
  		@com.google.inject.Inject
  		public Q_Gen140(Q_Gen141 q_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
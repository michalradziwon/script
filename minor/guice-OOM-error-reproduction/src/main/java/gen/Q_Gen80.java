
  package gen;
  public class Q_Gen80 {
  		@com.google.inject.Inject
  		public Q_Gen80(Q_Gen81 q_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
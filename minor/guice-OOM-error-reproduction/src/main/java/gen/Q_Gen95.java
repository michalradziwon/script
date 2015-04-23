
  package gen;
  public class Q_Gen95 {
  		@com.google.inject.Inject
  		public Q_Gen95(Q_Gen96 q_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
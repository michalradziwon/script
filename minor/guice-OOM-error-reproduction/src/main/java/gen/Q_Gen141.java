
  package gen;
  public class Q_Gen141 {
  		@com.google.inject.Inject
  		public Q_Gen141(Q_Gen142 q_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
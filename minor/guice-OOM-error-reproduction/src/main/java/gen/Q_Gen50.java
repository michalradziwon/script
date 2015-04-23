
  package gen;
  public class Q_Gen50 {
  		@com.google.inject.Inject
  		public Q_Gen50(Q_Gen51 q_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
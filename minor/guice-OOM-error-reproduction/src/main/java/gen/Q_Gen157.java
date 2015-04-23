
  package gen;
  public class Q_Gen157 {
  		@com.google.inject.Inject
  		public Q_Gen157(Q_Gen158 q_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
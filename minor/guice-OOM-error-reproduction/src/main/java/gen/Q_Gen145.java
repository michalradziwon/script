
  package gen;
  public class Q_Gen145 {
  		@com.google.inject.Inject
  		public Q_Gen145(Q_Gen146 q_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
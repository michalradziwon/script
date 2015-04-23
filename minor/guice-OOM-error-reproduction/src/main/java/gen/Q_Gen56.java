
  package gen;
  public class Q_Gen56 {
  		@com.google.inject.Inject
  		public Q_Gen56(Q_Gen57 q_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
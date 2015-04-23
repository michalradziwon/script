
  package gen;
  public class Q_Gen46 {
  		@com.google.inject.Inject
  		public Q_Gen46(Q_Gen47 q_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
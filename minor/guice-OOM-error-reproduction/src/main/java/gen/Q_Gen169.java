
  package gen;
  public class Q_Gen169 {
  		@com.google.inject.Inject
  		public Q_Gen169(Q_Gen170 q_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
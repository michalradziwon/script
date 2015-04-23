
  package gen;
  public class Q_Gen69 {
  		@com.google.inject.Inject
  		public Q_Gen69(Q_Gen70 q_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
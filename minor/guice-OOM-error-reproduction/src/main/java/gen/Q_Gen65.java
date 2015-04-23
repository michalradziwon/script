
  package gen;
  public class Q_Gen65 {
  		@com.google.inject.Inject
  		public Q_Gen65(Q_Gen66 q_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
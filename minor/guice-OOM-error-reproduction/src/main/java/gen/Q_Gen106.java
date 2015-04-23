
  package gen;
  public class Q_Gen106 {
  		@com.google.inject.Inject
  		public Q_Gen106(Q_Gen107 q_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
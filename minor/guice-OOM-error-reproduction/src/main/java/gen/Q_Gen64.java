
  package gen;
  public class Q_Gen64 {
  		@com.google.inject.Inject
  		public Q_Gen64(Q_Gen65 q_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
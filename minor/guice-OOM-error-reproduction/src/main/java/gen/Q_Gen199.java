
  package gen;
  public class Q_Gen199 {
  		@com.google.inject.Inject
  		public Q_Gen199(Q_Gen200 q_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
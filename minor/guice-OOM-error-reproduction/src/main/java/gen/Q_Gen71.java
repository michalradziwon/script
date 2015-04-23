
  package gen;
  public class Q_Gen71 {
  		@com.google.inject.Inject
  		public Q_Gen71(Q_Gen72 q_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
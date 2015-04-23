
  package gen;
  public class Q_Gen28 {
  		@com.google.inject.Inject
  		public Q_Gen28(Q_Gen29 q_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
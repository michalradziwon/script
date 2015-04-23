
  package gen;
  public class Q_Gen49 {
  		@com.google.inject.Inject
  		public Q_Gen49(Q_Gen50 q_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
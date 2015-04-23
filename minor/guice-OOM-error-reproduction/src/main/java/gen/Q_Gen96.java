
  package gen;
  public class Q_Gen96 {
  		@com.google.inject.Inject
  		public Q_Gen96(Q_Gen97 q_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
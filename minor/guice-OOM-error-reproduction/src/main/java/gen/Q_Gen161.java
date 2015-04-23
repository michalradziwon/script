
  package gen;
  public class Q_Gen161 {
  		@com.google.inject.Inject
  		public Q_Gen161(Q_Gen162 q_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
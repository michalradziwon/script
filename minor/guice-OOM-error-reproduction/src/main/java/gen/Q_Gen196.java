
  package gen;
  public class Q_Gen196 {
  		@com.google.inject.Inject
  		public Q_Gen196(Q_Gen197 q_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  

  package gen;
  public class Q_Gen195 {
  		@com.google.inject.Inject
  		public Q_Gen195(Q_Gen196 q_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
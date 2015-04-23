
  package gen;
  public class Q_Gen174 {
  		@com.google.inject.Inject
  		public Q_Gen174(Q_Gen175 q_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
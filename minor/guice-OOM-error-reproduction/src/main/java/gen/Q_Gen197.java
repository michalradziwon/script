
  package gen;
  public class Q_Gen197 {
  		@com.google.inject.Inject
  		public Q_Gen197(Q_Gen198 q_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
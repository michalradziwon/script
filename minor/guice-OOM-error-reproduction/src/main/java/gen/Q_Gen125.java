
  package gen;
  public class Q_Gen125 {
  		@com.google.inject.Inject
  		public Q_Gen125(Q_Gen126 q_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
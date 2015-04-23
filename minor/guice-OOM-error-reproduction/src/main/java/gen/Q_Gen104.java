
  package gen;
  public class Q_Gen104 {
  		@com.google.inject.Inject
  		public Q_Gen104(Q_Gen105 q_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
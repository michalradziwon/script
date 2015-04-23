
  package gen;
  public class Q_Gen94 {
  		@com.google.inject.Inject
  		public Q_Gen94(Q_Gen95 q_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
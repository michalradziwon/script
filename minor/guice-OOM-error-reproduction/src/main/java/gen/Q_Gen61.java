
  package gen;
  public class Q_Gen61 {
  		@com.google.inject.Inject
  		public Q_Gen61(Q_Gen62 q_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
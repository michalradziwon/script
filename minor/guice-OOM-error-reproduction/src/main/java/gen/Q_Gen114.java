
  package gen;
  public class Q_Gen114 {
  		@com.google.inject.Inject
  		public Q_Gen114(Q_Gen115 q_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
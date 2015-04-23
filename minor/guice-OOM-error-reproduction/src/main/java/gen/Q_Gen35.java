
  package gen;
  public class Q_Gen35 {
  		@com.google.inject.Inject
  		public Q_Gen35(Q_Gen36 q_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
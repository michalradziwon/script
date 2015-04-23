
  package gen;
  public class Q_Gen112 {
  		@com.google.inject.Inject
  		public Q_Gen112(Q_Gen113 q_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
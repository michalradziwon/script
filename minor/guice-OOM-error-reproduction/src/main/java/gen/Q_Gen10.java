
  package gen;
  public class Q_Gen10 {
  		@com.google.inject.Inject
  		public Q_Gen10(Q_Gen11 q_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  
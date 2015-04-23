
  package gen;
  public class M_Gen58 {
  		@com.google.inject.Inject
  		public M_Gen58(M_Gen59 m_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  